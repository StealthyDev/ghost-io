$(function () {
    initComponents();
});

function initComponents() {
    $("button").click(btnPressed);
}

function btnPressed(event) {
    var btn = $(this);
    triggerCommand("key", btn.attr("data-cmd"));
}

function triggerCommand(type, cmd) {
    console.log([type, cmd]);
}
