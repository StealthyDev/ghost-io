$(function () {
    initComponents();
});

function initComponents() {
    $("button").click(btnPressed);
}

function btnPressed(event) {
    var btn = $(this);
    triggerCommand(btn.attr("data-cmd"));
}

function triggerCommand(cmd) {
    console.log([cmd]);
    $.ajax({
        url: "/trigger/DCS-A-10C/" + cmd,
        context: document.body
    });
}
