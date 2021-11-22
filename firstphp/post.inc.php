<?php
session_start();
    if(isset($_POST['submit'])){
        $dbServername = "localhost";
        $dbUsername = "root";
        $dbPassword = "";
        $dbName = "loginsystem";
        $conn = mysqli_connect($dbServername, $dbUsername, $dbPassword, $dbName);

        $uid = mysqli_real_escape_string($conn, $_SESSION['u_id']);
        $text = mysqli_real_escape_string($conn, $_POST['text']);
        if (empty($text)){
            header("Location: ../firstphp/index.php?post=empty");
            exit();
        }
        else {
            $sql = "INSERT INTO post (user, content)
                                VALUES ('$uid','$text')";
            mysqli_query($conn, $sql);
            header("Location: ../firstphp/index.php?post=success");
            exit();
        }
    }