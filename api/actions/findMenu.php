<?php

$menu = findMenu($_GET['codigoMenu']);

echo json_encode($menu);
