class BuilderWithExistingBuilderClassWithSetterPrefix<T, K extends Number> {
	public static <Z extends Number> BuilderWithExistingBuilderClassWithSetterPrefix<String, Z> staticMethod(Z arg1, boolean arg2, String arg3) {
		return null;
	}
	public static class BuilderWithExistingBuilderClassWithSetterPrefixBuilder<Z extends Number> {
		@java.lang.SuppressWarnings("all")
		private boolean arg2;
		@java.lang.SuppressWarnings("all")
		private String arg3;
		private Z arg1;
		public void withArg2(boolean arg) {
		}
		@java.lang.SuppressWarnings("all")
		BuilderWithExistingBuilderClassWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithExistingBuilderClassWithSetterPrefixBuilder<Z> withArg1(final Z arg1) {
			this.arg1 = arg1;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithExistingBuilderClassWithSetterPrefixBuilder<Z> withArg3(final String arg3) {
			this.arg3 = arg3;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithExistingBuilderClassWithSetterPrefix<String, Z> build() {
			return BuilderWithExistingBuilderClassWithSetterPrefix.<Z>staticMethod(arg1, arg2, arg3);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithExistingBuilderClassWithSetterPrefix.BuilderWithExistingBuilderClassWithSetterPrefixBuilder(arg1=" + this.arg1 + ", arg2=" + this.arg2 + ", arg3=" + this.arg3 + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <Z extends Number> BuilderWithExistingBuilderClassWithSetterPrefixBuilder<Z> builder() {
		return new BuilderWithExistingBuilderClassWithSetterPrefixBuilder<Z>();
	}
}
