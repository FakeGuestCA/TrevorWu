<?php
include_once 'header.php';
?>

<section class="main-container">
    <div class="main-wrapper">
        <h2>Home</h2>
        <?php
        if(isset($_SESSION['u_id'])){

            echo '<form action="post.inc.php" method="POST">
            <input type="text" name="text" placeholder="Your text here.">
            <button type="submit" name="submit">Post</button>
        </form>';
        }
        ?>
        <style>
        table, tr, td{
            font-family: Arial;
    }
        </style>

        <body>
        <?php
        $dbServername = "localhost";
        $dbUsername = "root";
        $dbPassword = "";
        $dbName = "loginsystem";
        $conn = mysqli_connect($dbServername, $dbUsername, $dbPassword, $dbName);
        $query = "SELECT * FROM post";


        echo '<table width="100%"> 
      <tr> 
          <td> <font face="Arial">POST Number</font> </td> 
          <td> <font face="Arial">User ID</font> </td> 
          <td> <font face="Arial">Content</font> </td> 
      </tr>';

        if ($result = $conn->query($query)) {
            while ($row = $result->fetch_assoc()) {
                $field1name = $row["id"];
                $field2name = $row["content"];
                $field3name = $row["user"];



                echo '<tr> 
                  <td>'.$field1name.'</td> 
                  <td>'.$field3name.'</td>
                  <td>'.$field2name.'</td>
              </tr>';
            }
            $result->free();
        }
        ?>
        </body>
    </div>
</section>
<?php
    include_once 'footer.php';
?>
