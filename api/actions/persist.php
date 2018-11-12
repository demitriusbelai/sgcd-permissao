<?php

$dbh->beginTransaction();

if (array_key_exists('delPermissao', $_POST)) {
  $stmt = $dbh->prepare('DELETE FROM Permissao WHERE CodigoMenu = :codigoMenu AND LoginUsuario = :loginUsuario');
  foreach ($_POST['delPermissao'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoMenu', $obj->codigoMenu);
    $stmt->bindParam(':loginUsuario', $obj->loginUsuario);
    $stmt->execute();
  }
}

if (array_key_exists('delPermissaoPagina', $_POST)) {
  $stmt = $dbh->prepare('DELETE FROM PermissaoPagina WHERE CodigoPagina = :codigoPagina AND LoginUsuario = :loginUsuario');
  foreach ($_POST['delPermissaoPagina'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoPagina', $obj->codigoPagina);
    $stmt->bindParam(':loginUsuario', $obj->loginUsuario);
    $stmt->execute();
  }
}

if (array_key_exists('addPermissao', $_POST)) {
  $stmt = $dbh->prepare('INSERT INTO Permissao (CodigoMenu, LoginUsuario, Acesso, Criacao) VALUES (:codigoMenu, :loginUsuario, :acesso, :criacao)');
  foreach ($_POST['addPermissao'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoMenu', $obj->permissaoPK->codigoMenu);
    $stmt->bindParam(':loginUsuario', $obj->permissaoPK->loginUsuario);
    $stmt->bindParam(':acesso', $obj->acesso);
    $stmt->bindParam(':criacao', $obj->criacao);
    $stmt->execute();
  }
}

if (array_key_exists('addPermissaoPagina', $_POST)) {
  $stmt = $dbh->prepare('INSERT INTO PermissaoPagina (CodigoPagina, LoginUsuario, Criacao) VALUES (:codigoPagina, :loginUsuario, :criacao)');
  foreach ($_POST['addPermissaoPagina'] as $str) {
    $obj = json_decode($str);
    $stmt->bindParam(':codigoPagina', $obj->permissaoPaginaPK->codigoPagina);
    $stmt->bindParam(':loginUsuario', $obj->permissaoPaginaPK->loginUsuario);
    $stmt->bindParam(':criacao', $obj->criacao);
    $stmt->execute();
  }
}

$dbh->commit();

echo "ok";
