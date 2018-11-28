import frida
rdev = frida.get_usb_device()
apps = rdev.enumerate_applications()
for app in apps:
    print(app)
