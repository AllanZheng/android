<?php
//Global file included on all pages to setup Database Connection and session

//Connect to the DB
try
{
	$db = new PDO('mysql:host=db.dcs.aber.ac.uk;dbname=csgp11_14_15', 'tcg2-adm', 'group112014');
} 
catch (PDOException $e) 
{
	print "Error!: " . $e->getMessage() . "<br/>";
	die();
}

//And start the session
session_start();

?>