<?php

require_once 'include/sessao.php';
require_once 'include/conexao.php';
require_once 'include/autenticacao.php';
require_once 'include/functions.php';

foreach (glob("beans/*.php") as $filename)
{
    include_once $filename;
}

include 'actions/'.$_GET['q'];
