class AlarmedSubscriber : Subscriber {
    var newPost = false

    override fun onUpdate(alarm: String):Boolean {
        return if (alarm == "NEW") {
            newPost = true
            newPost
        }else{
            newPost
        }

    }
}