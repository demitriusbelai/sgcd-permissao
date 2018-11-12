<?php

class Usuario {

    public $login;

    public $senha;

    public $nome;

    public $email;

    public $tipo;

    public $criacao;

    public $excluido;

    public $acessos;

    public $ultimoLogin;

    public $permissaoList;

    //public $moduloList;

    //public $bannerList1;
    
    function __construct($row) {
      $this->login = $row['Login'];
      $this->senha = $row['Senha'];
      $this->nome = $row['Nome'];
      $this->Email = $row['Email'];
      $this->Tipo = $row['Tipo'];
      $this->Criacao = $row['Criacao'];
      $this->excluido = $row['Excluido'];
      $this->acessos = $row['Acessos'];
      $this->ultimoLogin = $row['UltimoLogin'];
    }
    
}
