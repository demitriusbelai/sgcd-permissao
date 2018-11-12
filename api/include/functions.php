<?php

function findUsuario($login) {
  global $dbh;

  $stmt = $dbh->prepare('SELECT * FROM Usuario WHERE Login = :login');
  $stmt->bindParam(':login', $login);
  $stmt->execute();
  return new Usuario($stmt->fetch());
}

function findUsuarios($tipo) {
  global $dbh;

  if ($tipo) {
    $stmt = $dbh->prepare('SELECT * FROM Usuario WHERE Tipo = :tipo');
    $stmt->bindParam(':tipo', $tipo);
  } else {
    $stmt = $dbh->prepare('SELECT * FROM Usuario');
  }
  $stmt->execute();
  $list = Array();
  while ($row = $stmt->fetch()) {
    $list[] = new Usuario($row);
  }
  return $list;
}

function findMenu($codigo) {
  global $dbh;

  $stmt = $dbh->prepare('SELECT * FROM Menu WHERE Codigo = :codigo');
  $stmt->bindParam(':codigo', $codigo);
  $stmt->execute();
  $menu = new Menu($stmt->fetch());
  $stmt->closeCursor();
  findMenuChilds($menu);
  return $menu;
}

function findMenuChilds(&$menu) {
  global $dbh;

  $stmt = $dbh->prepare('SELECT * FROM Menu WHERE CodigoPai = :codigo AND codigo != :codigo');
  $stmt->bindParam(':codigo', $menu->codigo);
  $stmt->execute();
  $menu->childs = Array();
  while ($row = $stmt->fetch()) {
    $m = new Menu($row);
    //$m->menuPai = $menu;
    findMenuChilds($m);
    $menu->childs[] = $m;
  }
  $stmt->closeCursor();
}

function findPagina($codigo) {
  global $dbh;

  $stmt = $dbh->prepare('SELECT * FROM Pagina WHERE Codigo = :codigo');
  $stmt->bindParam(':codigo', $codigo);
  $stmt->execute();
  return new Pagina($stmt->fetch());
}

function findPermissao($codigoMenu) {
  global $dbh;
  
  $stmt = $dbh->prepare('SELECT * FROM Permissao WHERE codigoMenu = :codigoMenu');
  $stmt->bindParam(':codigoMenu', $codigoMenu);
  $stmt->execute();

  $list = Array();

  while ($row = $stmt->fetch()) {
    $row['Usuario'] = findUsuario($row['LoginUsuario']);
    $row['Menu'] = findMenu($row['CodigoMenu']);
    $permissao = new Permissao($row);
    $list[] = $permissao;
  }
  return $list;
}

function findPermissaoPagina($codigo) {
  global $dbh;
  
  $stmt = $dbh->prepare('SELECT * FROM PermissaoPagina WHERE CodigoPagina = :codigoPagina');
  $stmt->bindParam(':codigoPagina', $codigo);
  $stmt->execute();

  $list = Array();

  while ($row = $stmt->fetch()) {
    $row['Usuario'] = findUsuario($row['LoginUsuario']);
    $row['Pagina'] = findPagina($row['CodigoPagina']);
    $permissao = new PermissaoPagina($row);
    $list[] = $permissao;
  }
  return $list;
}
