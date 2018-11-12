<?php

$out = findPermissao($_GET['codigoMenu']);

echo json_encode($out, JSON_UNESCAPED_SLASHES | JSON_NUMERIC_CHECK);
