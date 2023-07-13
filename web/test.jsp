<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/popup.css">
</head>

<body>
    <div class="box">
        <a href="#divOne" class="button">Click here</a>
    </div>

    <div class="overlay" id="divOne">
        <div class="wrapper">
            <h2>Please give us your feedback</h2>
            <a href="#" class="close">&times;</a>
            <div class="content">
                <div class="popup">
                    <form>
                        <label>First Name</label>
                        <input type="text" placeholder="please enter your first name">
                        <label>Last Name</label>
                        <input type="text" placeholder="please enter your last name">
                        <label>Email</label>
                        <input type="text" placeholder="please enter your email address">
                        <label>Feedback</label>
                        <textarea placeholder="PLease let us know your opinion about our products..."></textarea>
                        <input type="submit" value="Submit">
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>