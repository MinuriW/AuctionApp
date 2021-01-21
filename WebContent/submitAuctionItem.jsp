<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submit Auction Item</title>
</head>
<body>
    <div>
        <form action="#" method="POST" enctype="multipart/form-data">
            <label for="title">Title</label>
            <input name="title" type="text" /><br>
            <label for="condition">Condition</label>
            <input name="condition" type="text" /><br>
            <label for="photo">Photo</label>
            <input name="photo" type="file" /><br>
            <label for="timePeriod">Time period</label>
            <input name="timePeriod" type="number" /><br>
            <label for="startingPrice">Starting Price</label>
            <input name="startingPrice" type="number" /><br>
            <input type="submit" value="Submit Item" />
        </form>
    </div>
</body>
</html>