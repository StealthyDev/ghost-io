$(function () {
    initComponents();
});

function initComponents() {
    $(".dial").knob({'change': knobMoved});
    $("button").click(btnPressed);
}

function knobMoved(val, b) {
    var dial = this;
    var prevVal = this.$.attr("data-prev-val");
    var inc = this.$.attr("data-cmd-inc");
    prevVal = prevVal ? parseInt(prevVal) : 0;
    inc = inc ? parseInt(inc) : 1;
    this.$.attr("data-prev-val", val);
    triggerCommand("rotary", this.$.attr("data-cmd"), val, prevVal, inc);
}

function btnPressed(event) {
    var btn = $(this);
    triggerCommand("key", btn.attr("data-cmd"));
}

function triggerCommand(type, cmd, val, prevVal, inc) {
    console.log([type, cmd, val, prevVal, inc]);
}
