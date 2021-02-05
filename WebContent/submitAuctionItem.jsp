<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submit Auction Item</title>
    <script  type="text/javascript" src="submitAuctionItem.js" defer></script>
</head>
<body>
    <div>
        <form action="submitAuctionItem" method="POST" enctype="multipart/form-data">
            <label for="title">Title</label>
            <input id='title' name="title" type="text" onchange="validateTitle()" /><br>
            <label for="condition">Condition</label>
            <input id='condition' name="condition" type="text" onchange="validateCondition()"/><br>
            <label for="photo">Photo</label>
            <input id='photo' name="photo" type="file" onchange="validatePhoto()"/><br>
            <label for="timePeriod">Time period</label>
            <input id='timePeriod' name="timePeriod" type="text" onchange="validateTimePeriod()" /><br>
            <label for="startingPrice">Starting Price</label>
            <input id='startingPrice' name="startingPrice" type="text" onchange="validateStartingPrice()" /><br>
            <input id='submit' type="submit" value="Submit Item" />
        </form>
    </div>
    
</body>
</html>