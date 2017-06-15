object Global extends GlobalSettings {
	override def onStart(app: Application) {
		SessionFactory.concreteFactory = Some( () =>
			Session.create(DB.getConnection()(app), new H2Adapter)
		)
	}
}
