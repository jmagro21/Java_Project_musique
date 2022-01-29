
<?php
//include('Nhotel.php');
include('BaseD.php');
$db->exec('SET NAMES utf8');
$sql = "SELECT * FROM musique";
$request = $db->query($sql);
$muse = $request->fetchAll();
?>
<div id="container3">
    

    <?php
    for($i = 0; $i < sizeof($muse); $i++){
        $lamuse = $muse[$i];
    ?>
    <form id="1" action="Voter.php" method="post">
    <?php
        echo "<h1>".$lamuse['nom']."</h1>";
        echo "<p> Elle dure : ".$lamuse['dure']."</p>";
        echo "<p>Cette Musique possède ". $lamuse['vote'] ." vote(s).</p>";
    ?>
        <input type="hidden" name="vote" value="<?php echo $lamuse["vote"]?>">
        <input type="hidden" name="id" value="<?php echo $lamuse["id"]?>">
        <input type="hidden" name="nom" value="<?php echo $lamuse["nom"]?>">
        <input type="submit" id='submit' value="Voter" >

        
    </form>
    <?php
    }
    ?>
</div>