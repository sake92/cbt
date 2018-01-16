import cbt._

class Build(context: cbt.Context) extends BasicBuild(context){
  override def dependencies = (
    super.dependencies
    ++
    Seq(
      GitDependency("https://github.com/cvogt/cbt.git", "3fbf948b211c607aedd163db8fcd27587a09ff0d", Some("test/library-test"))
    )
  )
}
