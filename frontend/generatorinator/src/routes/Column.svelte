<script>
  import Box from "./Box.svelte";
  import Input from "./Input.svelte";

  export let rows = [''];
  export let disabled = false
  export let onChange;

</script>

<Box>
  <div class="space-y-5">
    {#each rows as row}
      <Input label="column value" onChange={onChange} bind:value="{row}" disabled="{disabled}"/>
    {/each}
  </div>
</Box>