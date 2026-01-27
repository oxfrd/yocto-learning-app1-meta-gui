#!/bin/sh
# LED on GPIO 17 (physical pin 11)

echo "Content-Type: text/plain"
echo

GPIO_CHIP=0
GPIO_LINE=17

case "$QUERY_STRING" in
    *on*)
        gpioset -t0 GPIO$GPIO_LINE=1
        echo "LED ON"
        ;;
    *off*)
        gpioset -t0 GPIO$GPIO_LINE=0
        echo "LED OFF"
        ;;
    *)
        gpioset -t0 GPIO$GPIO_LINE=1
        sleep 0.2
        gpioset -t0 GPIO$GPIO_LINE=0
        echo "LED BLINK"
        ;;
esac
