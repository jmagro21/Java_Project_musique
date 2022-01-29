<?php
include('BaseD.php');
$db->exec('SET NAMES utf8');

$vote=$_POST['vote'];
$vote=$vote+1;

$db->exec('UPDATE musique SET vote="'.$vote.'" WHERE nom="'.$_POST["nom"].'"');

header('Location: index.php');
?>