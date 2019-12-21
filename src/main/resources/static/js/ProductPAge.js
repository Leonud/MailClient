function addProduct() {
    var name = $("#name").val();
    var price = $("#price").val();
    var amount = $("#amount").val();

    var newProduct = {
        'name': name,
        'price': price,
        'amount': amount
    }

    // noinspection JSUnresolvedFunction
    $.ajax({
            method: 'POST',
            url: '/api/products/add',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(newProduct),
            success: function () {
                alert("succes");
                window.location.replace("/productPage")
            },
            error: function (error) {
                alert("error");
            }
        });
}