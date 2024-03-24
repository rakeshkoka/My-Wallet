/**
 * 
 */
function showSubCategoryDropdown() {
            var category = document.getElementById("category").value;

            // Hide all sub-category dropdowns
            var subCategoryDropdowns = document.getElementsByClassName("input-field-sub");
            for (var i = 0; i < subCategoryDropdowns.length; i++) {
                subCategoryDropdowns[i].classList.remove("selected");
                subCategoryDropdowns[i].style.display = "none";
            }

            // Show the corresponding sub-category dropdown based on the selected category
            var subCategoryDropdown = document.getElementById(category + "SubCategory");
            if (subCategoryDropdown) {
                subCategoryDropdown.classList.add("selected");
                subCategoryDropdown.style.display = "block";
            }
        }