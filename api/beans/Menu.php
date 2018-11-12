<?php

class Menu {

    public $codigo;

    public $codigoPai;

    public $nome;

    public $linkPagina;

    public $codigoPagina;

    public $pasta;

    public $paginaInterna;

    public $paginaExterna;

    public $destino;

    public $abreMenu;

    public $ordem;

    public $loginUsuario;

    public $criacao;

    public $atualizacao;

    public $acessos;

    public $restricao;

    public $usuarioAtualizacao;

    public $usuarioResponsavel;

    public $dataResponsavel;
    
    //public $menuPai;
    
    public $childs;

    //public $permissaoList;
    
    function __construct($row) {
      $this->codigo = $row['Codigo'];
      $this->codigoPai = $row['CodigoPai'];
      $this->nome = $row['Nome'];
      $this->linkPagina = $row['LinkPagina'];
      $this->codigoPagina = $row['CodigoPagina'];
      $this->pasta = $row['Pasta'];
      $this->paginaInterna = $row['PaginaInterna'];
      $this->paginaExterna = $row['PaginaExterna'];
      $this->destino = $row['Destino'];
      $this->AbreMenu = $row['AbreMenu'];
      $this->Ordem = $row['Ordem'];
      $this->LoginUsuario = $row['LoginUsuario'];
      $this->criacao = $row['Criacao'];
      $this->atualizacao = $row['Atualizacao'];
      $this->acessos = $row['Acessos'];
      $this->restricao = $row['Restricao'];
      $this->usuarioAtualizacao = $row['UsuarioAtualizacao'];
      $this->usuarioResponsavel = $row['UsuarioResponsavel'];
      $this->dataResponsavel = $row['DataResponsavel'];
    }

}
