# Chrome Custom Tab Download hangs forever

The following code:

```
val uri = Uri.parse("https://www.australiansuper.com/-/media/australian-super/files/tools-and-advice/forms-and-fact-sheets/superannuation/forms/update-your-details/binding-death-benefit-nomination-for-super-members.pdf")
val builder = CustomTabsIntent.Builder()
val customTabsIntent: CustomTabsIntent = builder.build()
customTabsIntent.launchUrl(ctx, uri)
```

Results in the CCT hanging forever on the download page.

See also:
- Video: https://drive.google.com/file/d/1ic1GUtK_WpDSshUWWLgHz0MsXB6vFn_J/view?usp=drive_link
- https://issues.chromium.org/issues/327468398
