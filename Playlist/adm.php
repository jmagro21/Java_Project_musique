<?php
if (isset($_SESSION['login'])) {
    include('BaseD.php');
    $db->exec('SET NAMES utf8');
    $sql = "SELECT adm FROM utilisateur WHERE pseudo='".$_SESSION['login']."'";
    $request1 = $db->query($sql);
    //$membre = $request->fetch();
    $membre = $request1->rowCount();
    
    if (isset($membre['adm'])) {
        echo '<a class="nav-link" href="Admin.php">Admin</a>';
    }
}
?>