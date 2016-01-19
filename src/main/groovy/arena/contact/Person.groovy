package arena.contact

class Person {
    String name

    def Person() {
        getClass().getResourceAsStream('/arena/resource.txt').withStream { InputStream str ->
            name = str.text.trim()
        }
        getClass().getResourceAsStream('/arena/script.groovy').withStream { InputStream str ->
            def shell = new GroovyShell()
            shell.person = this
            shell.evaluate(str.text)
        }
    }
}
