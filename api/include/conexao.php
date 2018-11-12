<?php

include "../../config.php";

$dbh = new PDO("mysql:host=".DB_HOST.";dbname=".DB_BASE, DB_USER, DB_PASS);
$dbh->query("SET NAMES 'utf8'");
$dbh->query("SET CHARACTER SET 'utf8'");
