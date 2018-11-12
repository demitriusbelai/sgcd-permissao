<?php

class PermissaoPagina {

    public $criacao;

    public $usuario;

    public $pagina;

    function __construct($row) {
      $this->criacao = $row['Criacao'];
      $this->usuario = $row['Usuario'];
      $this->pagina = $row['Pagina'];
    }

}
