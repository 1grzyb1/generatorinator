<script>
  import Box from "./Box.svelte";
  import Input from "./Input.svelte";
  import Button from "./Button.svelte";

  export let rows = [''];
  export let disabled = false

  function addRow() {
    rows = [...rows, ''];
  }
</script>

<Box>
  <div class="space-y-5">
    {#each rows as row}
      <Input label="column value" bind:value="{row}" disabled="{disabled}"/>
    {/each}
    {#if !disabled}
      <Button text="Add row" onClick="{addRow}"/>
    {/if}
  </div>
</Box>