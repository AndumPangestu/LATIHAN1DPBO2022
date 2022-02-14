  <?php

include "team.php";

$mu = new team("Manchester United", "Inggris", 1878);
$mu->addPemain("David De Gea");
$mu->addPemain("Cristiano Ronaldo");
$mu->addPemain("Paul Pogba");

echo $mu->getDaftarPemain();

echo "<br>";

echo $mu->getInfoTeamLengkap();

echo "<br>";
