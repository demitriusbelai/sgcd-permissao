<?php

include_once 'sessao.php';

if (!empty($_SESSION['user'])) {
  return;
}

if (!isset($_SERVER['PHP_AUTH_USER'])) {
  header('WWW-Authenticate: Basic realm="My Realm"');
  header('HTTP/1.0 401 Unauthorized');
  echo 'Acesso negado.';
  exit;
}

$stmt = $dbh->prepare("SELECT * FROM Usuario u JOIN Grupo g ON g.LoginUsuario = u.Login WHERE g.LoginGrupo = 'administrador' AND u.Email = :login AND u.Senha = PASSWORD(:senha)");
$stmt->bindParam(":login", $_SERVER['PHP_AUTH_USER']);
$stmt->bindParam(":senha", $_SERVER['PHP_AUTH_PW']);
$stmt->execute();
$row = $stmt->fetch();
if (!$row) {
  header('WWW-Authenticate: Basic realm="My Realm"');
  header('HTTP/1.0 401 Unauthorized');
  echo "Usuário ou senha inválido.";
  exit;
}

$_SESSION['user'] = $row['Login'];
$_SESSION['site'] = $_SERVER['HTTP_SITE'];