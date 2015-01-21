<!DOCTYPE html>
<html>
<body>

<?php
//remove all session variables
session_unset();

// destroy the session
session_destroy();

// redirects you back to the index 
header('Location: index.php');
exit;
    
?>

</body>
</html>

