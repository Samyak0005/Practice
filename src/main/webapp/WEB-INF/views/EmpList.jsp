
<!DOCTYPE html>
<html>
<body>

<h1>The input form attribute</h1>

<p>The form attribute specifies the form an input element belongs to.</p>

<form action="/action_page.php" id="form1">
    <label for="fname"> Employee name:</label>
    <input type="text" id="fname" name="fname"><br><br>
    <input type="submit" value="Submit">
</form>

<p>The  field below is outside the form element, but still part of the form.</p>

<label for="lname">Employee id:</label>
<input type="text" id="lname" name="lname" form="form1">

<label for="Cname">Employee dept:</label>
<input type="text" id="Cname" name="Cname" form="form1">

</body>
</html>
