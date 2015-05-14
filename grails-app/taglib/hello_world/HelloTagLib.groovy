package hello_world

class HelloTagLib {
    static defaultEncodeAs = [taglib: 'none']
    static namespace = 'gi'

    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    def hello = { attrs, body ->
        attrs.hello.split(',').each {
            out << body(it)
        }
    }
}
