<script>
  import Box from "./Box.svelte";
  import Input from "./Input.svelte";
  import Button from "./Button.svelte";
  import Column from "./Column.svelte";
  import AddButton from "./AddButton.svelte";
  import {goto} from '$app/navigation';
  import { env } from '$env/dynamic/public';

  let columns = [['']]
  let generatorName = ''

  function addColumn() {
    columns = [...columns, ['']]
  }

  async function create() {
    const res = await fetch(env.PUBLIC_BACKEND_URL + '/generator', {
      method: 'POST',
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify({
        name: generatorName,
        columns: columns.map(column => ({rows: column}))
      })
    })
    res.json().then(r => goto(`/generator/${r.id}`))
  }
</script>

<div class="grid justify-items-center">
  <Box>
    <div style="width: 60vw"></div>
    <div class="flex">
      <div class="flex-initial" style="width: 20vw">
        <Input label="Generator name" bind:value={generatorName}/>
      </div>

      <div class="flex-auto">
        <div class="grid justify-items-end">
          <div style="width: 20vw">
            <Button text="Create" onClick="{create}"/>
          </div>
        </div>
      </div>
    </div>

    <div class="flex mt-10 space-x-10 max-w-fit overflow-x-auto">
      {#each columns as column}
        <div class="min-w-fit">
          <Column bind:rows="{column}"/>
        </div>
      {/each}
      <div class="self-center">
        <AddButton onClick="{addColumn}"/>
      </div>
    </div>
  </Box>
</div>