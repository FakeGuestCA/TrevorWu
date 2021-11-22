<?php
    if(isset($_POST['submit'])){
        $dbServername = "localhost";
        $dbUsername = "root";
        $dbPassword = "";
        $dbName = "loginsystem";
        $conn = mysqli_connect($dbServername, $dbUsername, $dbPassword, $dbName);


        $first = mysqli_real_escape_string($conn, $_POST['first']);
        $last = mysqli_real_escape_string($conn,$_POST['last']);
        $email = mysqli_real_escape_string($conn, $_POST['email']);
        $uid = mysqli_real_escape_string($conn, $_POST['uid']);
        $pwd = mysqli_real_escape_string($conn, $_POST['pwd']);


        if(empty($first)||empty($last)||empty($email)||empty($uid)||empty($pwd)){
            header("Location: ../firstphp/signup.php?signup=empty");
            exit();
        }
        else{
            if(preg_match("/^[a-zA-Z]*$/", $first) == 0 || preg_match("/^[a-zA-Z]*$/", $last) == 0){
                header("Location: ../firstphp/signup.php?signup=invalid");
                exit();
            }
            else{
                if(!filter_var($email, FILTER_VALIDATE_EMAIL)){
                    header("Location: ../firstphp/signup.php?signup=email");
                    exit();
                }else{
                    $sql = "SELECT * FROM users WHERE user_uid='$uid'";
                    $result = mysqli_query($conn, $sql);
                    $resultCheck = mysqli_num_rows($result);
                    if($resultCheck > 0){
                        header("Location: ../firstphp/signup.php?signup=usertaken");
                        exit();
                    }
                    else{
                        $hashedPwd = password_hash($pwd, PASSWORD_DEFAULT);
                        $sql = "INSERT INTO users (user_first, user_last, user_email, user_uid, user_pwd)
                                VALUES ('$first','$last', '$email', '$uid', '$hashedPwd');";
                        mysqli_query($conn, $sql);
                        header("Location: ../firstphp/signup.php?signup=success");
                        exit();
                    }
                }
            }
        }
    }
    else{
        header("Location: ../firstphp/signup.php");
        exit();
    }