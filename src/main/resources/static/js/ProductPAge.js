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
                window.location.replace("/products/all")
            },
            error: function (error) {
                alert("error");
            }
        });
}

function fillmodel(id) {
    $.ajax({
        method: "get",
        url: '/api/products/get?id=' + id,
        contentType: 'application/json; charset=utf-8',
        success: function (product) {
            $('#id1-edit').val(product.id);
            $('#name1-edit').val(product.name);
            $('#price1-edit').val(product.price);
            $('#amount1-edit').val(product.amount);
        }
    })
}

function sendProduct() {
    var id = $("#id1").val();
    var name = $("#name1").val();
    var price = $("#price1").val();
    var amount = $("#amount1").val();

    var newProduct = {
        'id' : id,
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
            window.location.replace("/products/all")
        },
        error: function (error) {
            alert("error");
        }
    });
}