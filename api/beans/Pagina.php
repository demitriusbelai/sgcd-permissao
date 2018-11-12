<?php

class Pagina {

    public $codigo;

    public $nome;

    //public $conteudo;

    public $criacao;

    public $atualizacao;

    public $usuarioAtualizacao;

    public $loginUsuario;

    public $usuarioResponsavel;

    public $dataResponsavel;

    public $acessos;

    public $ultimoAcesso;

    public $restricao;

    //public List<PermissaoPagina> permissaoPaginaList;
    
    function __construct($row) {
      $this->codigo = $row['Codigo'];
      $this->nome = $row['Nome'];
      //$this->conteudo = $row['Conteudo'];
      $this->criacao = $row['Criacao'];
      $this->atualizacao = $row['Atualizacao'];
      $this->usuarioAtualizacao = $row['UsuarioAtualizacao'];
      $this->loginUsuario = $row['LoginUsuario'];
      $this->usuarioResponsavel = $row['UsuarioResponsavel'];
      $this->dataResponsavel = $row['DataResponsavel'];
      $this->acessos = $row['Acessos'];
      $this->ultimoAcesso = $row['UltimoAcesso'];
      $this->Restricao = $row['Restricao'];
    }

}
