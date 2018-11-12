<?php

$list = findUsuarios(array_key_exists('tipo', $_GET) ? $_GET['tipo'] : null);

echo json_encode($list, JSON_UNESCAPED_SLASHES | JSON_NUMERIC_CHECK);
