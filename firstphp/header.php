<?php session_start(); ?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forum</title>
    <link rel="stylesheet" href="reset.css" type="text/css">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<header>
    <nav>
        <div class="main-wrapper">
            <ul>
                <li><a href="index.php">Home</a></li>
            </ul>
            <div class="nav-login">
                <?php
                    if(isset($_SESSION['u_id'])){
                        echo '<form action="logout.inc.php" method="POST">
                              <button type="submit" name="submit">Log Out</button>
                             </form>';
                    }
                    else{
                        echo '<form action="login.inc.php" method="POST">
                              <input type="text" name="uid" placeholder="Username/email">
                              <input type="password" name="pwd" placeholder="Password">
                              <button type="submit" name="submit">Login</button>
                              
                             </form>';
                    }
                ?>

                <a href="signup.php">Sign up</a>
            </div>
        </div>
    </nav>
</header>
</body>
</html>
