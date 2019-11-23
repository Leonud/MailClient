var current = "green";
let colors = ["none", "none", "none", "none", "none", "none", "none", "none", "none"];

ymaps.ready(number);

function turn(number) {
    $("#s" + number).animate({
        backgroundColor: current
    }, 1000);
    colors[number - 1] = current;
    console.log(colors);
    if (current === "green") {
        current = "red";

    } else {
        current = "green";
    }
    $("#s" + number).prop("disabled", "true");

    var result = chek();
    if (result != "none" && result != true) {
        $("#result").animate({
            backgroundColor: result,
        }, 200)
        $("#result").text("Winner is");
    }
    if (result == "draw") {
        $("#result").text("draw");
    }

}

function chek() {
    if (colors[0] == colors[1] && colors[1] == colors[2] && colors[2] != "none") {
        return colors[0];
    }
    if (colors[3] == colors[4] && colors[4] == colors[5] && colors[5] != "none") {
        return colors[3];
    }
    if (colors[6] == colors[7] && colors[7] == colors[8] && colors[8] != "none") {
        return colors[6];
    }
    if (colors[0] == colors[3] && colors[3] == colors[6] && colors[6] != "none") {
        return colors[0];
    }
    if (colors[1] == colors[4] && colors[4] == colors[7] && colors[7] != "none") {
        return colors[1];
    }
    if (colors[2] == colors[5] && colors[5] == colors[8] && colors[8] != "none") {
        return colors[2];
    }
    if (colors[0] == colors[4] && colors[4] == colors[8] && colors[8] != "none") {
        return colors[0];
    }
    if (colors[2] == colors[4] && colors[4] == colors[6] && colors[6] != "none") {
        return colors[2];
    }

    let non = false;
    for (let i = 0; i < 9; i++) {
        if (colors[i] == "none") {
            non = true;
            return true;
        }
    }
    if (non == false) {
        return "draw";
    }
}