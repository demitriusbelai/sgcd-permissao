<?php

var_dump($_POST);

$dbh->beginTransaction();

if (array_key_exists('menu', $_POST)) {
  $stmt = $dbh->prepare('UPDATE Menu SET UsuarioResponsavel = :usuarioResponsavel WHERE Codigo = :codigoMenu');
  foreach ($_POST['menu'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoMenu', $obj->codigo);
    $stmt->bindParam(':usuarioResponsavel', $obj->usuarioResponsavel);
    $stmt->execute();
  }
}

if (array_key_exists('pagina', $_POST)) {
  $stmt = $dbh->prepare('UPDATE Pagina SET UsuarioResponsavel = :usuarioResponsavel WHERE Codigo = :codigoPagina');
  foreach ($_POST['pagina'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoPagina', $obj->codigo);
    $stmt->bindParam(':usuarioResponsavel', $obj->usuarioResponsavel);
    $stmt->execute();
  }
}

$dbh->commit();

echo "ok";
