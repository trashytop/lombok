class BuilderWithNonNullWithSetterPrefix {
	@lombok.NonNull
	private final String id;
	@java.lang.SuppressWarnings("all")
	BuilderWithNonNullWithSetterPrefix(@lombok.NonNull final String id) {
		if (id == null) {
			throw new java.lang.NullPointerException("id is marked non-null but is null");
		}
		this.id = id;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderWithNonNullWithSetterPrefixBuilder {
		@java.lang.SuppressWarnings("all")
		private String id;
		@java.lang.SuppressWarnings("all")
		BuilderWithNonNullWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithNonNullWithSetterPrefixBuilder withId(@lombok.NonNull final String id) {
			if (id == null) {
				throw new java.lang.NullPointerException("id is marked non-null but is null");
			}
			this.id = id;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithNonNullWithSetterPrefix build() {
			return new BuilderWithNonNullWithSetterPrefix(id);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithNonNullWithSetterPrefix.BuilderWithNonNullWithSetterPrefixBuilder(id=" + this.id + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static BuilderWithNonNullWithSetterPrefixBuilder builder() {
		return new BuilderWithNonNullWithSetterPrefixBuilder();
	}
}
