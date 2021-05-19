class AlarmMyUTube : MyUTube {
    val subscriberList = mutableListOf<Subscriber>()
    var alarm = "NEW"

    override fun update(alarm: String) {
        this.alarm = alarm
        subscriberList.forEach { it.onUpdate(alarm) }

        return true
    }

    override fun addSubscriber(subscriber:Subscriber) = subscriberList.add(subscriber)

    override fun deleteSubscriber(subscriber:Subscriber) = subscriberList.remove(subscriber)
}