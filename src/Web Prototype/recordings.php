<?php
require_once("./global.php");
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Plant Database: View</title>
        <link rel="stylesheet" type="text/css" href="pd.css">
            <link rel="icon" type="image/x-icon" href="favicon.ico" />
            <head>
                
                <div class="page-wrap">
                    <nav>
                        <ul id="navigation">
                            <li><a href="profile.php">My Profile</a></li>
                            <li><a href="recordings.php">View Recordings</a></li>
                            <li><a href="addreserve.php">New Reserve</a></li>
                            <li><a href="logout.php">Logout</a></li>
                        </ul>
                    </nav>
                    
                    <header id="headermain"><p>Plant Database</p></header>
                    
                    
                    <section>
                        <h1>View</h1><br>
                        <table class="tg" id="tableproto">
                            <tr>
                                <th class="tg-8xqh">ID</th>
                                <th class="tg-8xqh">Common Name</th>
                                <th class="tg-8xqh">Latin Name</th>
                                <th class="tg-8xqh">Time Created</th>
                                <th class="tg-8xqh">Reserve</th>
                            </tr>
							
					
                            <tr>
                                <td class="tg-031e">1</td>
                                <td class="tg-031e">Hedgehog Stonewort</td>
                                <td class="tg-031e">Chara aculeolata</td>
                                <td class="tg-031e">2014-11-18 17:14:33</td>
                                <td class="tg-031e">Unknown</td>
                            </tr>
                        </table>
                    </section>
                    
                    
                    
                    
                </div>
                
                <footer class="site-footer">
                    <p>&copy; 2014 - <a href="about.php"> About </a><a href="#"> Download </a></p>
                </footer>
                
                </body>
                
</html>
