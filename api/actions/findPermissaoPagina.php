<?php

$out = findPermissaoPagina($_GET['codigoPagina']);

echo json_encode($out);
