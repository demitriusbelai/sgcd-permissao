<?php

$usuario = findUsuario(array_key_exists('login', $_GET) ? $_GET['login'] : null);

echo json_encode($usuario, JSON_UNESCAPED_SLASHES | JSON_NUMERIC_CHECK);
