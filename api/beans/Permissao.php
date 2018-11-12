<?php

class Permissao {

    public $acesso;

    public $criacao;

    public $usuario;

    public $menu;
    
    function __construct($row) {
      $this->acesso = $row['Acesso'];
      $this->criacao = $row['Criacao'];
      $this->menu = $row['Menu'];
      $this->usuario = $row['Usuario'];
    }

}
