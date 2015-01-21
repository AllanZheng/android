<?php
require_once("./global.php");
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Plant Database</title>
        <link rel="stylesheet" type="text/css" href="pd.css">
            <link rel="icon" type="image/x-icon" href="favicon.ico" />
            <head>
                
                <div class="page-wrap">
                    <!-- <nav>
                     <ul id="navigation">
                     <li><a href="you.html">You</a></li>
                     <li><a href="view.html">View</a></li>
                     <li><a href="new.html">New</a></li>
                     <li><a href="index.html">Logout</a></li>
                     </ul>
                     </nav> -->
                    
                    <header id="headermain"><p>Plant Database</p></header>
                    
                    
                    <section id=log>
                        <h1>Login</h1><br>
                        
                        <form>
                            <label for="user">User:</label>
                            <input type="text" name="user">
                                <br>
                                <label for="password">Password:</label>
                                <input type="text" name="password"> <br>
                                    </form>
                        <!-- outside of form so doesnt submit and can be linked -->
                        <a href="profile.php"><input type="submit" value="Login"></a><br><br>
                        <small>Click <a href="reg.php">here</a> to register.</small>
                    </section>
                    
                    
                    
                    
                </div>
                
                <footer class="site-footer">
                    <p>&copy; 2014 - <a href="about.php"> About </a><a href="#"> Download </a></p>
                </footer>
                
                </body>
                
</html>
