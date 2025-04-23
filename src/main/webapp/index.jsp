<html>
<head><title>Calculator</title></head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calc" method="post">
        Number 1: <input type="text" name="num1"><br><br>
        Number 2: <input type="text" name="num2"><br><br>
        Operator: 
        <select name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>
