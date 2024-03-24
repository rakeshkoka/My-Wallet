<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Recipt</title>
<link rel="stylesheet" href="newRecordStyles.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container">
        <h2>Add New Recipt</h2>
        <form action="NewRecordServlet" method="post" enctype="multipart/form-data">

            <div class="input-field">
                    <input type="text" name="price" required />
                    <label>Enter Price</label>
            </div>

            <div class="input-field">
                    <input type="text" name="description" required />
                    <label>Description</label>
            </div>

            <div class="input-field">
                <!-- <label>Select a date:</label> -->
                <input type="date" id="dateInput" name="dateInput" step="1"> 
            </div>

            <div class="input-field">
                <input type="time" id="timeInput" name="timeInput">
            </div>

            <div class="input-field">
                <label for="paymentType">Select a Payment Type:</label>
                <select id="paymentType" name="paymentType">
                            <option value="choose">Choose</option>
                            <option value="food">Cash</option>
                            <option value="travel">Debit card</option>
                            <option value="food">Credit card</option>
                            <option value="home">Bank transfer</option>
                            <option value="food">Voucher</option>
                            <option value="food">Mobile payment</option>
                            <option value="food">Web transfer</option>
                </select>
            </div>

            <div class="input-field">

                <label for="category">Select a category:</label>
                <select id="category" name="category" onchange="showSubCategoryDropdown()">
                            <option value="choose">Choose</option>
                            <option value="food-drinks">Food & Drinks</option>
                            <option value="shopping">Shopping</option>
                            <option value="housing">Housing</option>
                            <option value="transportation">Transportation</option>
                            <option value="vehicle">Vehicle</option>
                            <option value="life-entertainment">Life & Entertainment</option>
                            <option value="communication-pc">Communication, PC</option>
                            <option value="investments">Investments</option>
                            <option value="income">Income</option>
                            <option value="others">Others</option>
                </select>
    
            </div>
    
            <div class="input-field-sub" id="food-drinksSubCategory">

                <label for="food-drinksOption">Food-Drinks options:</label>
                <select id="food-drinksOption" name="food-drinksOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="Food & Drinks">Food & Drinks</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="Bar, Cafe">Bar, Cafe</option>
                        <option value="Groceries">Groceries</option>
                        <option value="Restaurant, fast-food">Restaurant, fast-food</option>
                    </optgroup>
                </select>
            </div>
    
            <div class="input-field-sub" id="shoppingSubCategory">
                <label for="shoppingOption">Shopping options:</label>
                <select id="shoppingOption" name="shoppingOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="Shopping">Shopping</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="slothes-shoes">Clothes & shoes</option>
                        <option value="drug-store-chemist">Drug-store,chemist</option>
                        <option value="electronics-accessories">Electronics,accessories</option>
                        <option value="free-time">Free time</option>
                        <option value="gifts-joy">Gifts,joy</option>
                        <option value="health-and-beauty">Health and beauty</option>
                        <option value="home-garden">Home,garden</option>
                        <option value="jewels-accessories">Jewels, accessories</option>
                        <option value="kids">Kids</option>
                        <option value="pets-animals">Pets,animals</option>
                        <option value="stationery-tools">Stationery,tools</option>
                    </optgroup>
                </select>
            </div>
    
            <div class="input-field-sub" id="housingSubCategory">
                <label for="housingOption">Housing options:</label>
                <select id="housingOption" name="housingOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="housing">Housing</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="energy-utility">Energy,utility</option>
                        <option value="option1-2">Maintenance,repairs</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="transportationSubCategory">
                <label for="transportationOption">Transportation options:</label>
                <select id="transportationOption" name="transportationOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="vehicleSubCategory">
                <label for="vehicleOption">Vehicle option:</label>
                <select id="vehicleOption" name="vehicleOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="life-entertainmentSubCategory">
                <label for="life-entertainmentOption">Life-Entertainment options:</label>
                <select id="life-entertainmentOption" name="life-entertainmentOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="communication-pcSubCategory">
                <label for="communication-pcOption">Communication-PC options:</label>
                <select id="communication-pcOption" name="communication-pcOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="investmentsSubCategory">
                <label for="investmentsOption">Investments options:</label>
                <select id="investmentsOption" name="investmentsOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="incomeSubCategory">
                <label for="incomeOption">Income options:</label>
                <select id="incomeOption" name="incomeOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-sub" id="othersSubCategory">
                <label for="othersOption">Other options:</label>
                <select id="othersOption" name="othersOption">
                    <option value="choose">Choose</option>
                    <optgroup label="General">
                        <option value="option1-1">Option 1.1</option>
                    </optgroup>

                    <optgroup label="SubCategories">
                        <option value="option1-1">Option 1.1</option>
                        <option value="option1-2">Option 1.2</option>
                    </optgroup>
                </select>
            </div>

            <div class="input-field-picture">
                <input type="file" name="picture" required />
                <label>Choose Picture</label>
            </div>

            
            <button type="submit" name="userName" value="<%= request.getAttribute("userName") %>">Add</button>

        </form>
    </div>
    
    <script src="newRecordScript.js"></script>
    
</body>
</html>